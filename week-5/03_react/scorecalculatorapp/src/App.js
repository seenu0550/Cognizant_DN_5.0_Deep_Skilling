import { CalculateScore} from './Components/CalculateScore';
import './App.css';

function App() {
  return (
    <div>
      <CalculateScore Name={"Srinivas"}
      School={"SVVEM School"}
      total={955}
      goal={10}
      />
    </div>
  );
}

export default App;
